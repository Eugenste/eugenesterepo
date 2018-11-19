package ua.training.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        ConnectorDVI connectorDVI = new AdapterDVIToSVGA(new ConnectorSVGA());
        connectorDVI.connectWithDVI();
    }
}
