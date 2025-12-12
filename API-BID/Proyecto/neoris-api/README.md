# Neoris API Tests

Proyecto de pruebas automatizadas para la API de DemoBlaze usando Karate Framework.

## Requisitos

- Java 11
- Maven 3.6+

## Estructura del Proyecto

```
src/test/java/examples/users/
├── users.feature          # Casos de prueba de usuarios
└── UsersRunner.java       # Runner de JUnit5
```

## Casos de Prueba

- **Crear usuario**: Registro de nuevo usuario
- **Usuario duplicado**: Validación de usuario existente
- **Login exitoso**: Autenticación de usuario registrado
- **Login fallido**: Validación de credenciales incorrectas

## Ejecutar Pruebas

```bash
# Todas las pruebas
mvn test

# Prueba específica
mvn test -Dtest=UsersRunner
```

## API Base

- **URL**: https://api.demoblaze.com/
- **Endpoints**:
  - `POST /signup` - Registro de usuario
  - `POST /login` - Autenticación

## Reportes

Los reportes se generan en `target/karate-reports/karate-summary.html`