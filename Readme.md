# 📖 Literatura Challenge 📖    
¡Bienvenid@ a **Literatura**! Una aplicación diseñada para ayudarte a gestionar tu biblioteca personal de libros de manera intuitiva y eficiente.

---

## 🎯 **¿Qué es Literatura?**  
Literatura es una plataforma que combina datos externos y locales para brindarte una experiencia integral en la gestión de libros y autores. Conecta con la API de [Gutendex](https://gutendex.com/) y almacena información en una base de datos local para acceso sin conexión.

---

## 🚀 **Características principales**  
- 🔍 **Búsquedas inteligentes**: Encuentra libros por título o autor.  
- 📋 **Gestión completa**: Lista libros y autores registrados fácilmente.  
- 👨‍🎨 **Filtrados avanzados**: Busca autores vivos en años específicos o libros por idioma.  
- 🌟 **Ranking popular**: Consulta el top 10 de libros más buscados.  
- 📊 **Estadísticas completas**: Obtén datos analíticos sobre descargas de libros.  

---

## 🛠️ **Tecnologías utilizadas**  
Literalura se construyó utilizando las siguientes tecnologías modernas:  
- **Java 17**  
- **Spring Boot**  
- **Spring Data JPA**  
- **PostgreSQL**  

---

## ⚙️ **Cómo empezar**  
Sigue estos pasos para configurar y ejecutar el proyecto en tu máquina local:  

### 
```bash
1️⃣ **Clona el repositorio**  
git clone https://github.com/DevMGcode/LIteratura_challenge.git
cd LIteratura_challenge
2️⃣ Instala las dependencias
Asegúrate de tener Maven instalado y ejecuta:


Copiar código
mvn 

3️⃣ Configura tu base de datos
Asegúrate de tener PostgreSQL en funcionamiento y actualiza las credenciales en src/main/resources/application.properties:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost/literatura_challenge
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_PASSWORD
4️⃣ Ejecuta la aplicación
Inicia el servidor con:

bash
Copiar código
mvn spring-boot:run
¡Eso es todo! Ahora puedes disfrutar de Literatura.

📂 Estructura del proyecto
El proyecto está organizado de manera modular para facilitar la escalabilidad:

plaintext
Copiar código
📁 src/main/java/com/example/literatura
├── 📂 model         # Clases que representan los datos de libros y autores.
├── 📂 repository    # Interfaces para interactuar con la base de datos.
├── 📂 service       # Lógica de negocio y conexión con la API externa.
└── 📂 principal     # Contiene la clase principal para iniciar la aplicación.
📁 src/main/resources
├── application.properties  # Configuración del proyecto.
📄 pom.xml           # Dependencias del proyecto.

📝 Notas adicionales
Si deseas personalizar las consultas a la API de Gutendex, puedes explorar su documentación oficial.
Asegúrate de utilizar una versión de Java compatible (Java 17 o superior).

👥 Contribuciones
¡Las contribuciones son bienvenidas! Si tienes ideas para mejorar Literatura:

Haz un fork del proyecto.
Crea una rama para tus cambios (git checkout -b feature/nueva-funcionalidad).
Envía un Pull Request con una breve descripción de tu mejora.

