## < parkingLot-api >

## 1.Add parkinglot
### Method: POST
### Path:"/parkingLots/newParkingLots"
### Request
```java
ParkingLot parkingLot
{
    "id": "3"
}
```
### Response
```java
ArrayList<ParkingLot> parkingLots
[
    {
        "id": "1"
    },
    {
        "id": "2"
    },
    {
        "id": "3"
    }
]
```

## 2.Add parkingBoy
### Method: POST
### Path:"/parkingBoys/newBoys"
### Request
```java
ParkingBoy parkingBoy
{
    "id": "2",
    "parkingLots": [
        {
            "id": "111"
        },
        {
            "id": "000"
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
                "id": "1"
            },
            {
                "id": "2"
            }
        ]
    },
    {
        "id": "2",
        "parkingLots": [
            {
                "id": "111"
            },
            {
                "id": "000"
            }
        ]
    }
]
```

## 3.Arrange parkinglot for parkingBoy
### Method: PUT
### Path:"/parkingBoys/{id}/newParkingLots"
### Request
```java
String id, ParkingLot parkingLot
"1"
{
    "id": "666"
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
                "id": "1"
            },
            {
                "id": "2"
            },
            {
                "id": "666"
            }
        ]
    }
]
```
