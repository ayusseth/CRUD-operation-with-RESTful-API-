<h1>🚀 RestAPI Project</h1>
<p>
A simple yet powerful <strong>Spring Boot REST API</strong> for managing users 👨‍💻.<br>
This project demonstrates <strong>CRUD operations, exception handling, and database integration</strong> with MySQL.
</p>
<h2>✨ Features</h2>
<ul>
<li>📝 <strong>Create User</strong> → Add a new user to the database</li>
<li>📋 <strong>Read Users</strong> → Fetch all users or a single user by ID</li>
<li>🔄 <strong>Update User</strong> → Modify existing user details</li>
<li>❌ <strong>Delete User</strong> → Remove a user by ID</li>
<li>⚡ <strong>Global Exception Handling</strong> → Custom responses when something goes wrong</li>
<li>🗄 <strong>MySQL Integration</strong> → Persist user data with JPA/Hibernate</li>
</ul>

<h2>📂 Workflow</h2>
<ol>
<li><strong>Controller Layer</strong> (<code>Mycontroller.java</code>)  
<br>Handles all REST API requests (<code>/user</code>, <code>/user/{id}</code> etc.) and delegates to the service layer.
</li>
<li><strong>Service Layer</strong> (<code>UserService</code>, <code>UserServiceImpl</code>)  
<br>Contains core logic for CRUD operations.
</li>
<li><strong>Repository Layer</strong> (<code>UserRepository</code>)  
<br>Extends JPA repository to perform database operations.
</li>
<li><strong>Entity Layer</strong> (<code>User.java</code>)  
<br>Defines the User object mapped to the database.
</li>
<li><strong>Exception Handling</strong> (<code>GlobalExceptionHandler</code>, <code>UserNotFoundException</code>)  
<br>Centralized error handling with meaningful JSON responses.
</li>
</ol>

<h2>🌐 API Endpoints</h2>
<table>
<thead>
      <tr>
        <th>HTTP Method</th>
        <th>Endpoint</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><strong>POST</strong></td>
        <td>/user</td>
        <td>➕ Create a new user</td>
      </tr>
      <tr>
        <td><strong>GET</strong></td>
        <td>/user</td>
        <td>📋 Fetch all users</td>
      </tr>
      <tr>
        <td><strong>GET</strong></td>
        <td>/user/{id}</td>
        <td>🔍 Fetch a user by ID</td>
      </tr>
      <tr>
        <td><strong>PUT</strong></td>
        <td>/user/{id}</td>
        <td>✏️ Update user details</td>
      </tr>
      <tr>
        <td><strong>DELETE</strong></td>
        <td>/user/{id}</td>
        <td>❌ Delete a user by ID</td>
      </tr>
    </tbody>
  </table>
  <p><strong>Base URL:</strong> <code>http://localhost:8080</code></p>

  <h2>⚠️ Exception Handling</h2>
  <p>
    - If a user is <span class="highlight">not found</span>, the API throws <code>UserNotFoundException</code>.<br>
    - <code>GlobalExceptionHandler</code> catches it and returns a structured JSON response:
  </p>
  <pre>{
  "timestamp": "2025-09-30T06:44:11.483+00:00",
  "status": 404,
  "error": "Not Found",
  "path": "/user"
}</pre>
  <p>
    🛑 You experienced this exact <strong>404 error</strong> in Postman and in the IDE console logs because the controller package was not scanned initially.
  </p>

  <h2>🛠 Tech Stack</h2>
  <ul>
    <li>☕ Java 17+</li>
    <li>🌱 Spring Boot (Web, JPA, Validation)</li>
    <li>🐬 MySQL Database</li>
    <li>📝 Lombok (optional)</li>
  </ul>

  <h2>▶️ How to Run</h2>
  <ol>
    <li>Clone the repo:
      <pre><code>git clone &lt;repo-url&gt;
cd RestAPI</code></pre>
    </li>
    <li>Configure database in <code>application.properties</code>:
      <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/restapi_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true</code></pre>
    </li>
    <li>Run the application:
      <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li>Test APIs in Postman or cURL.</li>
  </ol>

  <h2>🎯 Example Postman Requests</h2>
  <p><strong>POST /user</strong></p>
  <pre>{
  "name": "John Doe",
  "email": "john@example.com"
}</pre>

  <p><strong>PUT /user/1</strong></p>
  <pre>{
  "name": "Updated John",
  "email": "updatedjohn@example.com"
}</pre>

  <h2>🎉 Conclusion</h2>
  <p>
    This project demonstrates:<br>
    ✅ Building REST APIs with Spring Boot<br>
    ✅ Using layered architecture (Controller → Service → Repository)<br>
    ✅ Graceful exception handling<br>
    ✅ MySQL integration
  </p>

  <p style="font-size: 18px;">✨ <em>Made with ❤️ using Spring Boot</em></p>

  ---
  <p align="center">
  <a href="https://linkedin.com/in/ayuseth" target="_blank">
    <img src="https://capsule-render.vercel.app/api?type=waving&color=00FFAB&height=100&section=footer&text=Ayush+Seth&fontSize=32&animation=twinkling&fontColor=ffffff" />
  </a>
