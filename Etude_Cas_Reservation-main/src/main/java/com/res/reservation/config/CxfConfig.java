package com.res.reservation.config;

import com.res.reservation.ws.ChambreSoapService;
import com.res.reservation.ws.ClientSoapService;
import com.res.reservation.ws.ReservationSoapService;
import lombok.NoArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
public class CxfConfig {

    private Bus bus;
    private ClientSoapService clientSoapService;
    private ChambreSoapService chambreSoapService;
    private ReservationSoapService reservationSoapService;

    public CxfConfig(Bus bus, ClientSoapService clientSoapService, ChambreSoapService chambreSoapService,
                     ReservationSoapService reservationSoapService) {
        this.bus = bus;
        this.clientSoapService = clientSoapService;
        this.chambreSoapService = chambreSoapService;
        this.reservationSoapService = reservationSoapService;
    }
    @Bean
    public Bus cxfBus() {
        return new SpringBus();
    }
    @Bean
    public EndpointImpl clientEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, clientSoapService);
        endpoint.publish("/client"); //  /ws/client
        return endpoint;
    }

    @Bean
    public EndpointImpl chambreEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, chambreSoapService);
        endpoint.publish("/chambre"); //  /ws/chambre
        return endpoint;
    }

    @Bean
    public EndpointImpl reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoapService);
        endpoint.publish("/reservation"); //  /ws/reservation
        return endpoint;
    }
}
