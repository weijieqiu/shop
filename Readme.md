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