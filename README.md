<div align="center">
  
  # VaxCenter
  [Logo would be placed here in actual README]
  
  ![Version](https://img.shields.io/badge/version-1.0-blue)
  ![Java](https://img.shields.io/badge/Java-8-red)
  ![License](https://img.shields.io/badge/license-MIT-green)
  [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Latest-blue)](https://www.postgresql.org/)
  [![Maven](https://img.shields.io/badge/Maven-3.8.x-red)](https://maven.apache.org/)

  *A comprehensive vaccination center management system*
</div>

## 📋 Overview

VaxCenter is a robust client-server application designed to monitor vaccination centers across Italy. The system manages vaccination tracking and allows citizens to report any post-vaccination adverse events through a user-friendly interface.

### Key Features
- 🏥 Vaccination center monitoring and management
- 💉 Vaccination tracking and record-keeping
- 👤 Personal citizen portal for adverse event reporting
- 🔐 Secure user authentication system
- 📊 Intuitive graphical interface
- 📱 Cross-platform compatibility

## 👥 Development Team
Project developed for the Interdisciplinary Laboratory B Course, University of Insubria

- **Cassani Alessandro**
- **Ficara Damiano**
- **Bruscagin Paolo**
- **Perfetti Luca**

## 🔧 System Requirements

### Hardware
| Component | Minimum Requirement |
|-----------|-------------------|
| Processor | 1 GHz or higher |
| RAM | 4GB or higher |
| Disk Space | 2 GB available |
| Display | 1280 x 720 pixels (HD) |

### Software Dependencies
- **Java:** Version 8 or higher
- **PostgreSQL:** Latest version (server only)
- **Maven:** For source compilation
- **Internet:** Stable connection required

### Supported Operating Systems
| OS | Version |
|----|---------|
| Windows | Windows 10 (8u51 and later) |
| Linux | Ubuntu 14.x (8u25 and later) |
| macOS | 10.8.3+ (and later) |

## ⚙️ Installation & Launch

### Quick Start
The application is distributed as a standalone executable requiring no installation process. Simply ensure Maven is installed on your system.

### Launch Methods

#### GUI Launch
1. Navigate to the `target/` directory
2. Double-click:
   - `serverCV-1.0.jar` for Server application
   - `clientCV-1.0.jar` for Client application

#### Command Line Launch
```bash
# Server Launch
cd /path/to/server/folder
java -jar serverCV-1.0.jar

# Client Launch
cd /path/to/client/folder
java -jar clientCV-1.0.jar
```

## 🛠️ Building from Source

### Maven Commands
Execute the following commands in sequence:

```bash
# Clean previous builds
mvn clean

# Validate project
mvn validate

# Compile source code
mvn compile

# Create package
mvn package

# Generate documentation
mvn javadoc:javadoc
```

After execution, the `target/` directory will contain:
- Executable files (.jar)
- JavaDoc documentation

## 📚 Documentation
Complete project documentation is available in the `target/site/apidocs/` directory after JavaDoc generation.

## 🤝 Contributing
To contribute to the project:
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 🔍 Testing
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=TestClassName

# Generate test coverage report
mvn verify
```

## 🌐 API Documentation
API documentation and endpoints are available at:
- Server running: `http://localhost:8080/api/docs`
- Swagger UI: `http://localhost:8080/swagger-ui.html`

## 🔒 Security
- All data transmission is encrypted using TLS 1.3
- Password hashing using BCrypt
- JWT-based authentication
- Regular security updates

## 📄 License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## 📞 Support
For support and queries:
- Create an issue in the GitHub repository
- Contact the development team at [team@vaxcenter.com](mailto:team@vaxcenter.com)

---
<div align="center">
  Made with ❤️ in Italy
</div>
