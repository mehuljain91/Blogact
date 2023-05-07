# Blogact - A Blog Management System

Blogact is a blog management system built using Spring Boot. It provides an easy-to-use interface for creating and managing blog posts, as well as viewing and commenting on posts by other users.

Blogact uses Spring Data Elasticsearch for data persistence, which allows for fast and efficient searching of blog posts. It also uses Apache Freemarker as the template engine for view, providing a clean and customizable interface for users.

To ensure fast and responsive performance, Blogact uses Spring WebFlux and Spring Security WebFlux to implement controllers and provide authentication and authorization. This allows for efficient handling of requests and secure access to blog features.

## Features

- User authentication and authorization
- Creating, editing, and deleting blog posts
- Viewing and commenting on blog posts
- Efficient searching of blog posts
- Clean and customizable view

## Getting Started

To run Blogact locally, you will need to have Elasticsearch installed and running on your system. You can download Elasticsearch from the official website: https://www.elastic.co/downloads/elasticsearch.

Once Elasticsearch is running, you can clone the Blogact repository and run the following command to start the application:

```
./mvnw spring-boot:run
```

The application will be available at http://localhost:8080.
