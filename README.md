# Grade API 🎓

A REST API built with Java (Spring Boot) that accepts a candidate name and score, and returns a JSON response with the corresponding grade.

## 🔗 API Endpoint

GET /api/grade?name={name}&score={score}

## 📊 Grading Scale

| Score  | Grade | Message                               |
| ------ | ----- | ------------------------------------- |
| 90-100 | A     | Excellent! Outstanding performance.   |
| 80-89  | B     | Great job! Above average performance. |
| 70-79  | C     | Good. Average performance.            |
| 60-69  | D     | Below average. Needs improvement.     |
| 0-59   | F     | Poor performance. Keep practicing!    |

## 📥 Sample Request

GET http://localhost:8080/api/grade?name=Asdaq&score=85

## ✅ Sample Response

```json
{
  "name": "Asdaq",
  "score": 85,
  "grade": "B",
  "message": "Great job! Above average performance."
}
```

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.2.0
- Maven
- REST API

## 🚀 How to Run

1. Clone the repo

```bash
git clone https://github.com/AsdaqNavedMallick/grade-api.git
cd grade-api
```

2. Run the app

```bash
mvn spring-boot:run
```

3. Test in browser

## 👨‍💻 Author

**Asdaq Naved Mallick** — B.Tech CSE, Dev Bhoomi Uttarakhand University
