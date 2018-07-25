## < parkingLot-api >

## 1.Add parkinglot
### Method: POST
### Path:"/parkingLots/newParkingLots"
### Request
```java
ParkingLot parkingLot
```
### Response
```java
ArrayList<ParkingLot> parkingLots
```

## 2.Add parkingBoy
### Method: POST
### Path:"/parkingBoys/newBoys"
### Request
```java
ParkingBoy parkingBoy
```
### Response
```java
ArrayList<ParkingBoy> parkingBoys
```

## 3.Arrange parkinglot for parkingBoy
### Method: PUT
### Path:"/parkingBoys/{id}/newParkingLots"
### Request
```java
String id, ParkingLot parkingLot
```
### Response
```java
ArrayList<ParkingBoy> parkingBoys
```
