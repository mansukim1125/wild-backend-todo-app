# Wild Backend To-do application

## Tasks API

### Create a Task
`POST /tasks`

Request Body
```json
{
  "title": "string",
  "priority": number // 여러 Tasks 간 우선순위
}
```

Response 201 Created
```json
{
  "id": "string",
  "title": "string",
  "priority": number,
  "completed": false,
  "createdAt": "2024-02-09T12:00:00Z"   // ISO 8601
}
```

### List Tasks
`GET /tasks`\
`GET /tasks?status=completed`\
`GET /tasks?status=incomplete`

Response 200 OK
```json
{
  "tasks": [
    {
      "id": "string",
      "title": "string",
      "priority": number,
      "completed": boolean,
      "createdAt": "2024-02-09T12:00:00Z"
    }
  ]
}
```

### Update Task Status
`PATCH /tasks/{id}`

Request Body
```json
{
  "completed": boolean
}
```

Response 200 OK
```json
{
  "id": "string",
  "title": "string",
  "priority": number,
  "completed": boolean,
  "createdAt": "2024-02-09T12:00:00Z"
}
```

### Update Task Priority
`PATCH /tasks/{id}`

Request Body
```json
{
  "priority": number    // 1: High, 2: Medium, 3: Low
}
```

Response 200 OK
```json
{
  "id": "string",
  "title": "string",
  "priority": number,
  "completed": boolean,
  "createdAt": "2024-02-09T12:00:00Z"
}
```

### Delete Task
`DELETE /tasks/{id}`

Response 204 No Content

## Error Responses

All error responses follow this format:

```json
{
  "error": {
    "code": number,     // HTTP Status Code와 동일
    "message": string   // 에러 상세 메시지
  }
}
```

### Example

400 Bad Request
```json
{
  "error": {
    "code": 400,
    "message": "Priority must be an integer"
  }
}
```

404 Not Found
```json
{
  "error": {
    "code": 404,
    "message": "Task with id 'abc123' not found"
  }
}
```

500 Internal Server Error
```json
{
  "error": {
    "code": 500,
    "message": "An unexpected error occurred"
  }
}
```