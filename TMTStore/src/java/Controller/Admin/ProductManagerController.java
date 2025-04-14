package Controller.Admin;

import DAO.productDAO;
import Entity.Category;
import Entity.Color;
import Entity.Product;
import Entity.Size;
import Entity.User;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author vietth
 */
public class ProductManagerController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String action = request.getParameter("action");
        try {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");

            if (user != null && user.getIsAdmin().equalsIgnoreCase("true")) {
                productDAO dao = new productDAO();

                // Xử lý hiển thị danh sách sản phẩm
                if (action == null || action.equals("")) {
                    List<Product> product = dao.getProduct();
                    List<Size> size = dao.getSize();
                    List<Color> color = dao.getColor();
                    List<Category> category = dao.getCategory();

                    request.setAttribute("CategoryData", category);
                    request.setAttribute("ProductData", product);
                    request.setAttribute("SizeData", size);
                    request.setAttribute("ColorData", color);

                    request.getRequestDispatcher("/admin/product.jsp").forward(request, response);
                }

                // Điều hướng tới trang thêm sản phẩm mới
                if (action.equalsIgnoreCase("insert")) {
                    List<Category> category = dao.getCategory();
                    request.setAttribute("CategoryData", category);
                    request.getRequestDispatcher("/admin/productinsert.jsp").forward(request, response);
                }

                // Xử lý thêm sản phẩm mới
                if (action.equalsIgnoreCase("insertproduct")) {

                    String product_id = request.getParameter("product_id");
                    String category_id = request.getParameter("category_id");
                    String product_name = request.getParameter("product_name");
                    String product_price = request.getParameter("product_price");
                    String product_size = request.getParameter("product_size");
                    String product_color = request.getParameter("product_color");
                    String product_quantity = request.getParameter("product_quantity");
                    String product_img = "images/" + request.getParameter("product_img");
                    String product_describe = request.getParameter("product_describe");

                    int quantity = Integer.parseInt(product_quantity);
                    BigDecimal price = new BigDecimal(product_price);
                    int cid = Integer.parseInt(category_id);

                    Category cate = new Category(cid);

                    String[] size_rw = product_size.split("\\s*,\\s*");
                    String[] color_rw = product_color.split("\\s*,\\s*");

                    List<Size> sizeList = new ArrayList<>();
                    for (String s : size_rw) {
                        sizeList.add(new Size(product_id, s));
                    }

                    List<Color> colorList = new ArrayList<>();
                    for (String c : color_rw) {
                        colorList.add(new Color(product_id, c));
                    }

                    Product product = new Product();
                    product.setCate(cate);
                    product.setProduct_id(product_id);
                    product.setProduct_name(product_name);
                    product.setProduct_price(price);
                    product.setProduct_describe(product_describe);
                    product.setQuantity(quantity);
                    product.setImg(product_img);
                    product.setSize(sizeList);
                    product.setColor(colorList);

                    dao.insertProduct(product);
                    response.sendRedirect("productmanager");
                }

                // Xử lý cập nhật sản phẩm
                if (action.equalsIgnoreCase("updateproduct")) {
                    String product_id = request.getParameter("product_id");
                    String category_id = request.getParameter("category_id");
                    String product_name = request.getParameter("product_name");
                    String product_price = request.getParameter("product_price");
                    String product_size = request.getParameter("product_size");
                    String product_color = request.getParameter("product_color");
                    String product_quantity = request.getParameter("product_quantity");
                    String product_img = "images/" + request.getParameter("product_img");
                    String product_describe = request.getParameter("product_describe");

                    int quantity = Integer.parseInt(product_quantity);
                    BigDecimal price = new BigDecimal(product_price);
                    int cid = Integer.parseInt(category_id);

                    Category cate = new Category(cid);

                    String[] size_rw = product_size.split("\\s*,\\s*");
                    String[] color_rw = product_color.split("\\s*,\\s*");

                    List<Size> sizeList = new ArrayList<>();
                    for (String s : size_rw) {
                        sizeList.add(new Size(product_id, s));
                    }

                    List<Color> colorList = new ArrayList<>();
                    for (String c : color_rw) {
                        colorList.add(new Color(product_id, c));
                    }

                    Product product = new Product();
                    product.setCate(cate);
                    product.setProduct_id(product_id);
                    product.setProduct_name(product_name);
                    product.setProduct_price(price);
                    product.setProduct_describe(product_describe);
                    product.setQuantity(quantity);
                    product.setImg(product_img);
                    product.setSize(sizeList);
                    product.setColor(colorList);

                    dao.updateProduct(product);  // Sử dụng phương thức updateProduct
                    response.sendRedirect("productmanager");
                }

                // Xử lý xóa sản phẩm
                if (action.equalsIgnoreCase("deleteproduct")) {
                    String product_id = request.getParameter("product_id");
                    System.out.println("Deleting product with ID: " + product_id); // Debug line
                    dao.deleteProduct(product_id);
                    response.sendRedirect("productmanager");
                }

            } else {
                response.sendRedirect("user?action=login");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("404.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
