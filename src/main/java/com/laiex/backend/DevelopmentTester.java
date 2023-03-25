package com.laiex.backend;

import com.laiex.backend.db.CarrierRepository;
import com.laiex.backend.db.OrderRepository;
import com.laiex.backend.db.StationRepository;
import com.laiex.backend.db.UserRepository;
import com.laiex.backend.db.entity.CarrierEntity;
import com.laiex.backend.db.entity.OrderEntity;
import com.laiex.backend.db.entity.StationEntity;
import com.laiex.backend.db.entity.UserEntity;
import com.laiex.backend.service.OrderService;
import com.laiex.backend.service.StripeService;
import com.laiex.backend.service.UserService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


@Component
public class DevelopmentTester implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(DevelopmentTester.class);
    private final UserRepository userRepository;
    private final CarrierRepository carrierRepository;
    private final StationRepository stationRepository;
    private final OrderRepository orderRepository;
    private final UserService userService;
    private final OrderService orderService;
    private final StripeService stripeService;

    private final PasswordEncoder passwordEncoder;

    public DevelopmentTester(UserRepository userRepository, CarrierRepository carrierRepository, StationRepository stationRepository, OrderRepository orderRepository, UserService userService, OrderService orderService, OrderService orderService1, StripeService stripeService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.carrierRepository = carrierRepository;
        this.stationRepository = stationRepository;
        this.orderRepository = orderRepository;
        this.userService = userService;
        this.orderService = orderService1;
        this.stripeService = stripeService;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        // UserEntity test
//        UserEntity user1 = new UserEntity(null,"test@gmail.com", "123","john", "z",1231233213);
//        userRepository.save(user1);
//
//        UserEntity user2 = new UserEntity(null,"test2@gmail.com", "123","john", "z",1231233213);
//        userRepository.save(user2);
//
        // CarrierEntity test
        CarrierEntity carrier1 = new CarrierEntity(null, CarrierEntity.CarrierType.RobotCar, 0, 1000, Integer.MAX_VALUE);
        carrierRepository.save(carrier1);
//
//        CarrierEntity carrier2 = new CarrierEntity(null, CarrierEntity.CarrierType.UAV, 0, 500, Integer.MAX_VALUE);
//        carrierRepository.save(carrier2);
////
//        //StationEntity test
//        StationEntity station1 = new StationEntity(null, "San Francisco", "285 Olympia Way, San Francisco, CA 94131", 37.75112100170498, -122.456254888161, null);
//        StationEntity station2 = new StationEntity(null, "San Francisco", "24 Willie Mays Plaza, San Francisco, CA 94107", 37.77877584407026, -122.3887915467984, null);
//        stationRepository.save(station1);
//        stationRepository.save(station2);

//        // OrderEntity test
//        OrderEntity order1 = new OrderEntity(null, 1L, LocalTime.now(), LocalTime.now(), LocalTime.now(), "285 Olympia Way, San Francisco, CA 94131", "24 Willie Mays Plaza, San Francisco, CA 94107",
//                                                1L, 150.79, OrderEntity.status.ordered);
//        orderRepository.save(order1);

        //register tester
//        userService.register("abc@gmail.com", "123", "john","z",1231233213);


        // stripe product generator test
//        String productId1 = stripeService.createRide(1 + "" + LocalTime.now());
//        stripeService.attachPriceToProductId(10549, productId1);
//        stripeService.stripOrderGenerator(productId1);
//
//        orderService.placeOrder(1L, LocalDateTime.parse("2023-03-24 10:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
//                LocalDateTime.parse("2023-03-24 10:30:10",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
//                LocalDateTime.parse("2023-03-24 10:30:15",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
//                "1600 Holloway Ave, San Francisco, CA 94132",
//                "450 10th St, San Francisco, CA 94103", 1L, 150.5, OrderEntity.status.ordered, productId1);
//
//        String productId2 = stripeService.createRide(1 + "" + LocalTime.now());
//        stripeService.attachPriceToProductId(10549, productId2);
//        stripeService.stripOrderGenerator(productId2);
//        orderService.placeOrder(2L, LocalDateTime.parse("2023-03-24 10:30:05",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
//                LocalDateTime.parse("2023-03-24 10:30:08",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
//                LocalDateTime.parse("2023-03-24 10:30:13",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
//                "1600 Holloway Ave, San Francisco, CA 94132", "450 10th St, San Francisco, CA 94103",
//                2L, 150.5, OrderEntity.status.ordered, productId1);



    }
}
