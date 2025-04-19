# goodsmanagment
A fun pet project about managing goods in a supermarket chain.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [How to Run the Project](#how-to-run-the-project)
    - [Setting Up PostgreSQL](#setting-up-postgresql)
    - [Running the Application](#running-the-application)
- [Scripts](#scripts)
    - [start-postgres.ps1](#1-start-postgresps1)
    - [stop-postgres.ps1](#2-stop-postgresps1)
- [Dockerizing the Application](#dockerizing-the-application)
- [Spotless Code Formatting Check](#spotless-code-formatting-check)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This is a **Goods Management System** that allows supermarkets to track and manage the goods in their inventory. The system supports adding, updating, and removing goods, along with generating reports, managing stock levels, and integrating with external services like **PostgreSQL**.

---

## Features

- **Inventory Management**: Add, update, or remove products.
- **Product Catalog**: View products and their details.
- **Barcode/QR Integration**: Handle barcode and QR code scanning for products.
- **PostgreSQL Integration**: Store product information persistently using PostgreSQL.
- **Kafka Support**: (Future Feature) Use Kafka for event-driven communication.

---

## Technologies Used

- **Java 21**
- **Spring Boot 3**
- **Docker**
- **PostgreSQL 16**
- **Apache Kafka** (planned feature)

---

## How to Run the Project

### Setting Up PostgreSQL

To run PostgreSQL locally, use the provided PowerShell scripts to manage the Docker container for PostgreSQL.

1. **Start PostgreSQL**: This will pull and run the PostgreSQL container, set up the database with the necessary configurations, and map the host port to the container port.
2. **Stop PostgreSQL**: This will stop and remove the running PostgreSQL container.

#### Running the Scripts

You can manage the PostgreSQL container with the following scripts:

1. **To start PostgreSQL**, navigate to the `scripts/` directory and run the `start-postgres.ps1` script:

   ```powershell
   .\start-postgres.ps1

## Spotless Code Formatting Check

We use the **Spotless** plugin in this project to ensure that our code is consistently formatted according to specified standards. This helps in maintaining readability and reducing unnecessary formatting conflicts across team members.

Spotless integrates with Maven, and you can easily run it to check if your code follows the defined formatting rules, and even apply automatic fixes.

### How to Run Spotless

1. **Check Code Formatting**:

   To check if the code follows the formatting rules, you can use the following Maven command:

   ```bash
   mvn spotless:check

2. **Apply Code Formatting**:

   To apply the code formatting rules, you can use the following Maven command:

   ```bash
   mvn spotless:apply   