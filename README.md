# howtostartprogramming-code-examples

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white)
![Terraform](https://img.shields.io/badge/Terraform-7B42BC?style=for-the-badge&logo=terraform&logoColor=white)
![System Design](https://img.shields.io/badge/System_Design-0052CC?style=for-the-badge&logo=blueprint&logoColor=white)

> Official code companion repository for articles published on [howtostartprogramming.in](https://howtostartprogramming.in)

---

## 📖 Repository Overview

This repository contains **production-quality code examples**, **architecture diagrams**, and **hands-on tutorials** that accompany the in-depth technical articles published on [howtostartprogramming.in](https://howtostartprogramming.in).

Whether you are preparing for a Java interview, learning Spring Boot internals, designing scalable systems, or automating infrastructure with Terraform — you will find practical, well-documented examples here.

---

## 🗂️ Table of Contents

- [Technologies Covered](#technologies-covered)
- [Repository Structure](#repository-structure)
- [Article Categories](#article-categories)
  - [Java](#java)
  - [Spring Boot](#spring-boot)
  - [System Design](#system-design)
  - [Terraform](#terraform)
  - [AWS](#aws)
  - [Interview Preparation](#interview-preparation)
- [How to Use This Repository](#how-to-use-this-repository)
- [Contributing](#contributing)
- [Learn More](#learn-more)
- [Connect With Us](#connect-with-us)
- [License](#license)

---

## 🛠️ Technologies Covered

| Technology       | Topics                                                                 |
|------------------|------------------------------------------------------------------------|
| **Java**         | Concurrency, Streams, Mockito, Java 21, Virtual Threads                |
| **Spring Boot**  | Spring Security, Spring Batch, REST APIs, Microservices                |
| **System Design**| Notification Service, Rate Limiter, URL Shortener, Event-Driven Design |
| **Terraform**    | AWS VPC, IAM Roles, S3, EC2, RDS Modules                               |
| **AWS**          | Lambda, ECS, RDS, CloudFront, Route 53                                 |
| **Interview**    | Core Java, Spring, DSA, Behavioral, System Design Rounds               |

---

## 🗃️ Repository Structure

```
howtostartprogramming-code-examples/
├── java/
│   ├── java-concurrency/
│   ├── java-streams/
│   ├── mockito/
│   ├── java-21-features/          # 🚧 Coming Soon
│   ├── virtual-threads/           # 🚧 Coming Soon
│   └── structured-concurrency/    # 🚧 Coming Soon
├── spring-boot/
│   ├── spring-security/
│   ├── spring-batch/
│   └── spring-ai/                 # 🚧 Coming Soon
├── system-design/
│   ├── notification-service/
│   └── system-design-interview/   # 🚧 Coming Soon
├── terraform/
│   ├── aws-vpc/
│   ├── iam-roles/
│   └── terraform-best-practices/  # 🚧 Coming Soon
├── aws/
│   └── README.md
└── interview-preparation/
    └── README.md
```

---

## 📚 Article Categories

### Java

| Tutorial | Description | Article Link |
|----------|-------------|--------------|
| [Java Concurrency](./java/java-concurrency/) | Threads, ExecutorService, CompletableFuture, locks | [Read Article →](https://howtostartprogramming.in/java-concurrency/) |
| [Java Streams](./java/java-streams/) | Stream API, collectors, flatMap, parallel streams | [Read Article →](https://howtostartprogramming.in/java-streams/) |
| [Mockito](./java/mockito/) | Unit testing with mocks, stubs, verify, ArgumentCaptor | [Read Article →](https://howtostartprogramming.in/mockito/) |

### Spring Boot

| Tutorial | Description | Article Link |
|----------|-------------|--------------|
| [Spring Security](./spring-boot/spring-security/) | JWT authentication, role-based access, filter chains | [Read Article →](https://howtostartprogramming.in/spring-security/) |
| [Spring Batch](./spring-boot/spring-batch/) | Job processing, ItemReader, ItemProcessor, ItemWriter | [Read Article →](https://howtostartprogramming.in/spring-batch/) |

### System Design

| Tutorial | Description | Article Link |
|----------|-------------|--------------|
| [Notification Service](./system-design/notification-service/) | Multi-channel notification system design with Kafka | [Read Article →](https://howtostartprogramming.in/notification-service/) |

### Terraform

| Tutorial | Description | Article Link |
|----------|-------------|--------------|
| [AWS VPC](./terraform/aws-vpc/) | Production-grade VPC with public/private subnets | [Read Article →](https://howtostartprogramming.in/terraform-aws-vpc/) |
| [IAM Roles](./terraform/iam-roles/) | Least-privilege IAM roles and policies for AWS | [Read Article →](https://howtostartprogramming.in/terraform-iam-roles/) |

### AWS

See the [AWS section](./aws/) for examples covering Lambda, ECS, RDS, and more.

### Interview Preparation

See the [Interview Preparation section](./interview-preparation/) for curated question banks and answers.

---

## 🚀 How to Use This Repository

1. **Browse by technology** — navigate to the relevant folder (e.g., `java/`, `spring-boot/`)
2. **Read the README** — each subfolder has a detailed README with problem statement, architecture, and explanation
3. **Run the code** — follow the *Build Instructions* in each README
4. **Read the full article** — every README links back to the original article on [howtostartprogramming.in](https://howtostartprogramming.in)

### Prerequisites

- Java 17+ (Java 21 recommended)
- Maven 3.8+
- Docker (for Spring Boot examples)
- Terraform 1.6+ (for infrastructure examples)
- AWS CLI (for AWS examples)

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** this repository
2. **Create** a feature branch: `git checkout -b feature/my-topic`
3. **Add** your code example with a proper README following the [folder README format](./java/java-concurrency/README.md)
4. **Submit** a Pull Request with a clear description

### Contribution Guidelines

- Each example must include a working `README.md`
- Code must be clean, well-commented, and follow Java/Spring conventions
- Architecture diagrams should use [Mermaid](https://mermaid.js.org/)
- Every README must link back to a relevant article or resource

---

## 🌐 Learn More

For detailed tutorials, interview questions, architecture diagrams, and source code explanations, visit:

**[https://howtostartprogramming.in](https://howtostartprogramming.in)**

---

## 🔗 Connect With Us

| Platform | Link |
|----------|------|
| 🌐 Website | [howtostartprogramming.in](https://howtostartprogramming.in) |
| ✍️ Dev.to | [dev.to](https://dev.to) |
| 📺 YouTube | [youtube.com](https://youtube.com) |

---

## 📜 License

This repository is licensed under the [MIT License](LICENSE).

You are free to use, copy, modify, and distribute the code examples for personal and commercial purposes with attribution.

---

<p align="center">
  Made with ❤️ by <a href="https://howtostartprogramming.in">howtostartprogramming.in</a>
</p>
