# **TMT eCommerce Sneaker Store Project**  
This is a web application that allows users to browse, purchase, and manage sneakers. It includes an admin panel for managing customer accounts, products, and orders, alongside features like user authentication, product management, cart functionality, and a simple checkout process.

---

## Main Features
### **User Features**

- **Log In / Sign Up**: Users can register and log in to their accounts.
- **Account Management**: Users can view and edit their personal account information, including updating passwords.
- **Cart**: Users can add products to the cart, view the cart, and update product quantities.
- **Purchase**: Users can proceed to checkout and complete purchases.
- **Order Tracking**: Users can view their order history. 
- **Contact Information**: Users and admins can view and update contact details for customer support and inquiries.
- **Other Features**: Enhanced user experience, including product filtering, promotional discounts, and feedback receiving.

### **Admin Features**

- **Manage Customers**: Admins can assign and manage user roles, such as Admin and Customer.
- **Manage Orders**: Admins can view order details or delete order .
- **Manage Products**: Admins can add, update, or remove products from the catalog.
- **Payment Methods**: Admins can configure payment methods, including:
  - **Cash on Delivery (COD)**
  - **QR Code (Online Bank Payment)**
- **Sales Reports**: Admins can generate reports on sales, revenue, and user activity.
- **Inventory Management**: Admins can track product stock levels and manage inventory.

## Tech Stack
### Frontend
<p>
  <img src="https://img.shields.io/badge/-HTML5-%23E44D27?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" />
  <img src="https://img.shields.io/badge/-CSS3-%231572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3" />
  <img src="https://img.shields.io/badge/-JavaScript-%23F7DF1C?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" />
  <img src="https://img.shields.io/badge/-Bootstrap%204-%23563D7C?style=for-the-badge&logo=bootstrap&logoColor=white" alt="Bootstrap 4" />
  <img src="https://img.shields.io/badge/-JQuery-%230769AD?style=for-the-badge&logo=jquery&logoColor=white" alt="JQuery" />
</p>

### Backend
<p>
  <img src="https://img.shields.io/badge/-Java-%23007396?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/-Tomcat-%23202020?style=for-the-badge&logo=apachetomcat&logoColor=white" alt="Tomcat Server" />
</p>

### Database
<p>
  <img src="https://img.shields.io/badge/-SQL%20Server-%23CC2927?style=for-the-badge&logo=microsoft-sql-server&logoColor=white" alt="SQL Server" />
</p>


---

## **Graphical User Interface (GUI)**  

![image](https://github.com/user-attachments/assets/9dc3c55e-8eaf-4d54-83be-eda5696a5dc0)
![image](https://github.com/user-attachments/assets/59147b8d-00ce-490b-8a29-59259ec5db27)
![image](https://github.com/user-attachments/assets/dc4ad98b-a831-4fb1-918d-a6cbb93f6e2b)
![image](https://github.com/user-attachments/assets/672aa815-b125-4ea0-a99c-b89649e36ba8)
![image](https://github.com/user-attachments/assets/c088e2a5-5719-4281-95ed-d8857251c6e8)
![image](https://github.com/user-attachments/assets/a827f9d3-75e4-41fd-b780-c4e78771777a)
![image](https://github.com/user-attachments/assets/ab62964c-6cf0-40dc-8971-8118a64c767c)
![image](https://github.com/user-attachments/assets/b3fc74ac-f383-49e5-925c-4529ac15080e)
![image](https://github.com/user-attachments/assets/5f24459e-7c9d-4dba-856c-f0ddbc87d7a2)
![image](https://github.com/user-attachments/assets/29cc9a96-45d3-437e-895a-581a052f812d)
![image](https://github.com/user-attachments/assets/9622d7e8-f156-4014-8a29-1f603119baa1)
![image](https://github.com/user-attachments/assets/f7da8732-1a7a-4535-8636-6f56fbf78aed)
![image](https://github.com/user-attachments/assets/dda39a5b-0898-4e9d-ab04-13488f62dc8f)
![image](https://github.com/user-attachments/assets/ad55e56d-7a17-4a56-957b-4786f084c1a1)
![image](https://github.com/user-attachments/assets/2a5c5f41-61d7-4999-ac77-94436fe87d1e)
![image](https://github.com/user-attachments/assets/20c4e7c8-972e-40cb-9391-71119ea80410)
![image](https://github.com/user-attachments/assets/d587de8f-bc5b-4602-ae31-3bd08ae3c8a5)
![image](https://github.com/user-attachments/assets/de4e3a57-e3f2-488f-9d44-c6a47548daad)
![image](https://github.com/user-attachments/assets/3dd8fb4c-cb2a-4bb4-b11d-3967af8bf355)

---

## **Database Design**  

![database](https://github.com/user-attachments/assets/1244673d-c555-47e9-812e-0a815073aecb)

---

## **System Design**  
![image](https://github.com/user-attachments/assets/199c56c7-eab8-46b6-adf7-4d8daf190c78)
![image](https://github.com/user-attachments/assets/87911904-bf32-4893-bde9-46f08d046576)
![image](https://github.com/user-attachments/assets/91c8337b-d7f5-4ae8-8075-aca59140600a)

---

# **Conclusion**
### **Pros:**
- The application features an attractive and user-friendly interface, making it easy for users to navigate.
- It integrates useful libraries, such as **VIETQR API** and **Google Maps API**, enhancing its functionality.
- The application is equipped with comprehensive features that improve the user experience, ensuring a smooth interaction for visitors.

### **Cons:**
- The application faces **scalability limitations**, which may cause issues when handling high traffic volumes.
- The **code is not yet fully optimized**, leading to excessive memory usage and slower performance.
- Certain features lack proper logic and are prone to small errors. For example, there is a bug in the cart system when adding the same product after refresh product detail    page, leading to **negative stock numbers** during checkout, contrary to the logic of preventing orders that exceed available inventory.
---
## Lessons Learned During Development

1. **Team Selection and Collaboration:**
   - We learned the importance of selecting a team with a shared goal and compatible skills. Teamwork is crucial for success, and understanding each member’s strengths allowed us to allocate tasks efficiently, speeding up the development process.

2. **Code Standardization:**
   - We realized the necessity of establishing consistent coding practices, including standardized naming conventions, database structure, and code formatting. This avoids confusion and issues when merging code, ensuring smoother collaboration and fewer errors.

3. **User Experience Focus:**
   - The project reinforced that the user experience (UX) should always be a top priority. A well-designed, intuitive interface makes the application easier to navigate and enhances the overall user satisfaction.

4. **Practical Experience is Key:**
   - We learned that hands-on practice is essential for truly understanding frontend and backend development. Through active involvement, we gained deeper insights into debugging and optimizing code, improving both our technical skills and overall approach to web development.
---
## **Future Plans and Enhancements**

To improve the application and make it more versatile and scalable, we plan to add the following features:

### 1. **Inventory Management by Color and Size:**
   - Implement a feature to manage inventory based on color and size variations, where each combination has a unique quantity.

### 2. **Code Refactoring for Clarity:**
   - Refactor the existing code to make it more modular, intuitive, and developer-friendly for future collaborators. This includes improved documentation, standardized naming conventions, and separation of concerns.

### 3. **Marketing Features:**
   - Add marketing-related functionalities, such as:
     - **Discount Codes**: Allow users to apply promotional codes at checkout.
     - **Dynamic Pricing**: Implement a flexible pricing strategy to respond to market trends.

### 4. **Unique Cart:**
   - Each user will have a unique cart that is tied to their account.
   - The cart will only be accessible when the user logs in to the account associated with it.
   - This ensures privacy and data integrity, preventing other users from viewing or manipulating someone else’s cart.

### 5. **AI-Based User Insights:**
   - Develop AI-powered features to analyze user behavior and identify market trends. This will help in personalizing the user experience and staying ahead in a competitive market.

### 6. **Fix Existing Minor Bugs:**
   - Address small bugs and logical inconsistencies currently present in the project (if any) to ensure smoother performance and better user satisfaction.

### 7. **Scalability Improvements:**
   - Optimize the backend for better scalability and performance to handle a higher volume of traffic efficiently.

### 8. **Validation Login/Register Input:**
   - This improvement will structure the program's database into a specific format, making it more professional. It minimizes logic-related errors and enhances security.
---

## **Contributors**

| **Name**            | **Student ID** | **GitHub**                            |
|---------------------|----------------|---------------------------------------|
| **Mạc Viết Thông**  | SE181966       | [GitHub](https://github.com/vitoo16)  |
| **Nguyễn Ngọc Minh**  | SE182009      | [GitHub](https://github.com/NguyenNgocMinh-SE182009)  |


---

#  "TMT-Shoes-Ecommerce-Website" 
