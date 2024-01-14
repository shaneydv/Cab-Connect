### CabConnect - Real-time Cab Location Simulator

CabConnect is a dynamic and real-time cab location simulator, meticulously crafted with Spring Boot and Kafka technologies. This backend application seamlessly orchestrates two services, namely cab-location-user and cab-location-driver, ensuring a swift and continuous exchange of updates.

### Features

Real-time Updates: Experience a seamless flow of real-time updates as the driver's location is dynamically refreshed every second.
Immersive Tracking: Stay in the loop with an immersive and responsive cab tracking experience, providing users with accurate and up-to-the-second location information.

### How It Works

cab-location-driver Service: This service dynamically updates and broadcasts the cab's location using Spring Boot and Kafka.
cab-location-user Service: Consumers, or users, can subscribe to the cab-location-user service to receive real-time updates on the cab's location.

### Output Preview

![cab-loc-img](https://github.com/shaneydv/Cab-Connect/assets/78971334/9d263d31-16c2-4bc8-9f8d-1dc80f395709)
