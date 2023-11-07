# Simplified Hotel Management System

The HotelApp needs to manage various hotel services for guest check-in and check-out. These services include valet parking for vehicles, room cleaning, and handling luggage carts. However, the HotelApp aims to interact with these services through a simplified, single interface provided by the FrontDesk. The FrontDesk class should delegate the client's requests to the appropriate service classes (Valet, HouseKeeping, Cart) while abstracting the service details from the client.

# Class Definitions:
HotelService (Interface): Defines the common interface for all hotel services.

Valet: A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up. It includes the pickUpVehicle(plateNumber) method.

HouseKeeping: A service class implementing the HotelService interface, responsible for room cleaning. It includes the cleanRoom(roomNumber) method.

Cart: A service class implementing the HotelService interface, responsible for handling luggage cart requests. It includes the requestCart(numberOfCarts) method.

FrontDesk: The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services.

HotelApp: The client class that uses the FrontDesk facade to access and utilize hotel services seamlessly.

In your solution you must provide the following in your Github link account:

- Problem statement (description of the problem. Just copy what is stated here.<br>
- UML Class Diagram<br>
- Uploaded java codes for the solution.<br>

UML Class Diagram of Simplified Hotel Management System using Facade Pattern.<br>

![Facade Pattern UML](https://github.com/brixcyver/facadePattern/assets/142380216/6607607b-b5ee-4819-babe-266146ddb608)<br>

I hope this repository will help you with your possible future tasks that can be implemented using this pattern.

