## < parkingLot-api >

## 1.Add parkinglot
### Method: POST
### Path:"/parkingLots"
### Request
```java
ParkingLot parkingLot
{
    "id": "3",
    "size":3
}
```
### Response
```java
ArrayList<ParkingLot> parkingLots
[
    {
        "id": "1",
        "size":5
    },
    {
        "id": "2",
        "size":10
    },
    {
        "id": "3",
        "size":3
    }
]
```

## 2.Add parkingBoy
### Method: POST
### Path:"/parkingBoys"
### Request
```java
ParkingBoy parkingBoy
{
    "id": "2",
    "parkingLots": [
        {
            "id": "111",
            "size":1
        },
        {
            "id": "000",
            "size":10
        }
    ]
}
```
### Response
```java
ArrayList<ParkingBoy> parkingBoys
[
    {
        "id": "1",
        "parkingLots": [
            {
                "id": "1",
                "size":5
            },
            {
                "id": "2",
                "size":10
            }
        ]
    },
    {
        "id": "2",
        "parkingLots": [
            {
                "id": "111",
                "size":1
            },
            {
                "id": "000",
                "size":10
            }
        ]
    }
]
```

## 3.Arrange parkinglot for parkingBoy
### Method: PUT
### Path:"/parkingBoys/{id}"
### Request
```java
String id, ParkingLot parkingLot
"1"
{
    "id": "666",
    "size":6
}
```
### Response
```java
ArrayList<ParkingBoy> parkingBoys
[
    {
        "id": "1",
        "parkingLots": [
            {
                "id": "1",
                "size":5
            },
            {
                "id": "2",
                "size":10
            },
            {
                "id": "666",
                "size":6
            }
        ]
    }
]
```
