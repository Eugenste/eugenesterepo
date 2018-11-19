package ua.training.adapter;

public class AdapterDVIToSVGA implements ConnectorDVI {
    private ConnectorSVGA connectorSVGA;

    public AdapterDVIToSVGA(ConnectorSVGA connectorSVGA) {
        this.connectorSVGA = connectorSVGA;
    }

    @Override
    public void connectWithDVI() {
        connectorSVGA.connectWithSVGA();
    }
}
