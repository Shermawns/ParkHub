package com.Park_Api.mapper;

import com.Park_Api.controller.Requests.ClientRequest;
import com.Park_Api.controller.Responses.ClientResponse;
import com.Park_Api.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public Client toClient(ClientRequest clientRequest){
        return new Client(
                clientRequest.name(),
                clientRequest.cpf()
        );
    }

    public ClientResponse toResponse(Client client){
        return new ClientResponse(
                client.getId(),
                client.getName(),
                client.getCpf(),
                client.getRole()
        );
    }
}
