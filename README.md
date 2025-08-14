# 💰 Conversor de Monedas - Challenge ONE Java Backend

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/API-ExchangeRate-green?style=for-the-badge" alt="API">
  <img src="https://img.shields.io/badge/Challenge-ONE-orange?style=for-the-badge" alt="Challenge ONE">
</div>

## 🌟 Descripción

¡Bienvenido al **Conversor de Monedas**! Una aplicación de consola desarrollada en **Java** que te permite convertir entre diferentes monedas en tiempo real. Este proyecto fue creado como parte del **Challenge ONE - Java Backend** de Alura Latam.

### ✨ Características Principales

- 🔄 **Conversiones en tiempo real** entre USD, EUR, CLP y ARS
- 🌐 **API integrada** de ExchangeRate-API para tasas actualizadas
- 🎨 **Interfaz de consola** con colores y formato mejorado
- ⚡ **Manejo robusto de errores** y validaciones
- 🚀 **Código simple y legible** perfecto para principiantes

## 🛠️ Tecnologías Utilizadas

- **Java 17+** - Lenguaje principal
- **HTTP Client** - Para consultas a la API
- **Gson** - Parsing de JSON
- **ExchangeRate-API** - Tasas de conversión en tiempo real

## 📋 Requisitos Previos

- Java 17 o superior
- Conexión a internet (para consultar la API)
- IDE de tu preferencia (IntelliJ IDEA, Eclipse, VS Code)

## 🚀 Instalación y Uso

### 1. Clona el repositorio
```bash
git clone https://github.com/LDP33/ConversorDeMoneda-ChallengeONE-Java.git
cd ConversorDeMoneda-ChallengeONE-Java
```

### 2. Abre el proyecto en tu IDE
- IntelliJ IDEA: `File → Open → Selecciona la carpeta del proyecto`
- Eclipse: `File → Import → Existing Projects into Workspace`
- VS Code: `File → Open Folder → Selecciona la carpeta del proyecto`

### 3. Ejecuta el programa
```bash
# Desde la línea de comandos
javac -cp "lib/*" src/*.java
java -cp "lib/*:src" ConversorDeMoneda

# O desde tu IDE, ejecuta la clase ConversorDeMoneda
```

## 🎮 Cómo Usar

1. **Ejecuta el programa** y verás el menú principal
2. **Selecciona una opción** del 1 al 6 para el tipo de conversión
3. **Ingresa el monto** que deseas convertir
4. **¡Obtén tu resultado!** en la moneda seleccionada

### 📊 Opciones Disponibles

| Opción | Conversión | Descripción |
|--------|------------|-------------|
| 1 | USD → EUR | Dólar a Euro |
| 2 | EUR → USD | Euro a Dólar |
| 3 | CLP → USD | Peso Chileno a Dólar |
| 4 | USD → CLP | Dólar a Peso Chileno |
| 5 | USD → ARS | Dólar a Peso Argentino |
| 6 | ARS → USD | Peso Argentino a Dólar |
| 7 | Salir | Cerrar aplicación |

## 🔧 Estructura del Proyecto

```
ConversorDeMoneda-ChallengeONE-Java/
├── src/
│   ├── ConversorDeMoneda.java      # Clase principal con la lógica del menú
│   ├── ConsultaMonedaApi.java      # Cliente para consultar la API
│   └── Moneda.java                 # Record para mapear la respuesta JSON
├── lib/                            # Dependencias (Gson)
└── README.md                       # Este archivo
```

## 🌐 API Utilizada

Este proyecto utiliza la **ExchangeRate-API** para obtener tasas de conversión en tiempo real:

- **URL Base**: `https://v6.exchangerate-api.com/v6/`
- **Endpoint**: `/latest/USD`
- **Respuesta**: JSON con tasas de conversión desde USD

### Ejemplo de respuesta de la API:
```json
{
  "base_code": "USD",
  "conversion_rates": {
    "EUR": 0.85,
    "CLP": 850.50,
    "ARS": 350.25
  }
}
```

## 🎯 Funcionalidades Técnicas
- Validación de entrada de usuario
- Manejo de errores de red
- Verificación de tasas de conversión válidas

### 🔄 Lógica de Conversión
- **Conversiones directas**: USD → Otras monedas
- **Conversiones inversas**: Otras monedas → USD (usando 1/tasa)

### 🎨 Interfaz de Usuario
- Menú colorido con caracteres Unicode
- Mensajes informativos y claros
- Formato mejorado para mejor experiencia

## 👨‍💻 Autor

**Leandro Pollano** - https://github.com/LDP33
Proyecto creado para el **Challenge ONE - Java Backend** de Alura Latam.

