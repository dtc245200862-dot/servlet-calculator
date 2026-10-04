# [Bài tập] Ứng dụng Calculator - JSP & Servlet

Ứng dụng máy tính cơ bản (Cộng, Trừ, Nhân, Chia) xây dựng bằng Java Servlet và JSP theo chuẩn Jakarta EE cho máy chủ Tomcat 10+.

## Cấu trúc dự án
```
servlet-calculator/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    └── main/
        ├── java/
        │   └── com/codegym/
        │       ├── model/
        │       │   └── Calculator.java         # Lớp xử lý tính toán và ngoại lệ chia cho 0
        │       └── servlet/
        │           └── CalculatorServlet.java  # Servlet nhận dữ liệu form và trả về kết quả
        └── webapp/
            ├── index.jsp                       # Giao diện Form nhập toán tử và toán hạng
            └── WEB-INF/
                └── web.xml                     # Cấu hình Webapp
```

## Chức năng
- Nhập hai số (First operand, Second operand) và lựa chọn toán tử (+, -, *, /).
- Xử lý tính toán qua `Calculator.calculate()`.
- Bắt lỗi ngoại lệ và hiển thị thông báo lỗi khi chia cho 0 (`Can't divide by zero`).

## Hướng dẫn chạy dự án
```bash
mvn clean package
```
Deploy file `target/servlet-calculator.war` lên Apache Tomcat 10+ và truy cập:
```
http://localhost:8080/servlet-calculator/
```
