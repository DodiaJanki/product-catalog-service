# Product Catalog Service - Kubernetes Multi-Tier Deployment

## Source Code Repository

GitHub Repository:
https://github.com/DodiaJanki/product-catalog-service

---

## Docker Hub Images

Docker Hub Repository:
https://hub.docker.com/repository/docker/janki1616/product-catalog

Image Used:
- product-catalog:v1
- product-catalog:v2 (for rolling update demo)

---

## Service API Tier URL

Ingress URL:

http://34.138.102.150/products

### Sample API Response:

```json
[
  {
    "id": 1,
    "name": "iPhone 17",
    "category": "Mobile",
    "price": 99999,
    "stock": 25
  },
  {
    "id": 2,
    "name": "MacBook Pro",
    "category": "Laptop",
    "price": 199999,
    "stock": 10
  },
  {
    "id": 3,
    "name": "AirPods Pro",
    "category": "Accessories",
    "price": 24999,
    "stock": 50
  },
  {
    "id": 4,
    "name": "Samsung S26",
    "category": "Mobile",
    "price": 89999,
    "stock": 15
  },
  {
    "id": 5,
    "name": "Dell XPS",
    "category": "Laptop",
    "price": 149999,
    "stock": 12
  }
]
```

Screen Recording Demonstration

Video Link:
https://drive.google.com/drive/folders/1sAgUqmP6jIctU6_hbsZfEB449vuQDmVe?usp=drive_link

The recording demonstrates:
All Kubernetes objects deployed and running
ConfigMap and Secret usage verification
API call retrieving data from PostgreSQL database
Ingress-based external access to the application
deployment demonstration
Product catalog pod deletion and automatic recreation (Self-Healing)
PostgreSQL pod deletion and automatic recovery with persistent data
Rolling update deployment strategy (v1 & v2)
Horizontal Pod Autoscaler (HPA) scaling based on CPU usage