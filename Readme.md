# 2020-01-07
- 根据`id`更新用户状态接口
```text
GET http://localhost:8888/api/updateUserStatus?id=1&status=%E5%90%AF%E7%94%A8

HTTP/1.1 200 
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 07 Jan 2020 03:47:54 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "status": "200",
  "message": "用户状态修改成功",
  "data": {
    "userList": {
      "id": "1",
      "username": "Admin",
      "password": "Admin123.",
      "email": "Admin@123.com",
      "telephone": "123",
      "role": "超级管理员",
      "status": "启用"
    },
    "isChangeStatus": true
  }
}
``
- 获取用户列表接口补充返回列表总数
```text
GET http://localhost:8888/api/getUserList?query=User&pageNum=1&pageSize=4

HTTP/1.1 200 
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 07 Jan 2020 01:56:46 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "status": "200",
  "message": "获取用户列表成功",
  "data": {
    "total": 4,
    "userList": [
      {
        "id": "2",
        "username": "User",
        "password": "User123.",
        "email": "User@123.com",
        "telephone": "123",
        "role": "用户",
        "status": "启用"
      },
      {
        "id": "3",
        "username": "User1",
        "password": "User123.",
        "email": "User@123.com",
        "telephone": "123",
        "role": "用户",
        "status": "禁用"
      },
      {
        "id": "4",
        "username": "User2",
        "password": "User123.",
        "email": "User@123.com",
        "telephone": "123",
        "role": "用户",
        "status": "启用"
      }
    ]
  }
}
```
# 2020-01-06
- 获取用户列表接口补充分页查询与模糊查找
# 2020-01-05
- 获取用户列表接口完成
```json
{
  "status": "200",
  "message": "获取用户列表成功",
  "data": [
    {
      "id": "1",
      "username": "Admin",
      "password": "Admin123.",
      "email": "Admin@123.com",
      "telephone": "123",
      "role": "超级管理员",
      "status": "启用"
    },
    {
      "id": "2",
      "username": "User",
      "password": "User123.",
      "email": "User@123.com",
      "telephone": "123",
      "role": "用户",
      "status": "启用"
    }
  ]
}
```
# 2020-01-04
- 获取商品列表接口完成
```json
{
    "status": "200",
    "message": "获取列表成功",
    "data": [
        {
            "id": 1,
            "authName": "商品管理",
            "path": null,
            "children": [
                {
                    "id": 101,
                    "authName": "商品列表",
                    "path": null,
                    "children": null
                },
                {
                    "id": 102,
                    "authName": "商品查询",
                    "path": null,
                    "children": null
                }
            ]
        },
        {
            "id": 2,
            "authName": "用户管理",
            "path": null,
            "children": [
                {
                    "id": 201,
                    "authName": "用户列表",
                    "path": null,
                    "children": null
                },
                {
                    "id": 202,
                    "authName": "用户查询",
                    "path": null,
                    "children": null
                }
            ]
        }
    ]
}
```
# 2020-01-02
- 前端传过来用户名和密码、后端生成 `token` 返回给前端