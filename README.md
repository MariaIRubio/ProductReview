### Exercise: Product Review Submission System in Spring

#### Objective:
To develop a product review submission form for a website, including validation for input fields using regular expressions. Additionally, integrate default security configuration provided by Spring Boot.

#### Scenario:
You are tasked with building a product review submission system for an e-commerce website. The review submission form should collect information such as reviewer name, email, rating, and review comments. Furthermore, you need to validate the input fields using regular expressions and integrate default security configuration provided by Spring Boot to secure the application.

#### Instructions:

#### 1. Set up a Spring project with Maven:
  - Create a new Maven project and include the necessary dependencies for Spring.

#### 2. Create a product review submission form:
  - Design a review submission form using HTML and Thymeleaf. Include fields for reviewer information such as name, email, rating, and review comments.

#### 3. Implement Java-based validation using regular expressions:
  - Use regular expressions where necessary.

#### 4. Integrate default security configuration provided by Spring Boot:
  - Spring Boot provides default security configuration out of the box. Configure your application to leverage this default security configuration to secure the review submission form and other endpoints.

#### 5. Save review data in the database:
  - Configure your application to connect to a database using Spring Data JPA or any other preferred persistence framework. Create a repository interface for the review entity to perform CRUD operations.

#### 6. Display appropriate error messages for invalid input fields:
  - Handle validation errors in your controller. If any field fails validation, return the user back to the review submission form with error messages indicating the invalid fields.

#### 7. Set up a controller to handle form submission and process the review submission:
  - Create a controller class to handle form submissions. Define methods to display the review submission form, process form submissions.

#### 8. Display a success message or redirect to a confirmation page:
  - After successfully saving the review data, redirect the user to a confirmation page or display a success message indicating that the review was submitted successfully.
