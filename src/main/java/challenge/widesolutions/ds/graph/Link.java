package challenge.widesolutions.ds.graph;

public class Link {
    private final String id;
    private final Node source;
    private final Node destination;
    private final int cost;

    public Link(String id, Node source, Node destination, int cost) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }
    public Node getDestination() {
        return destination;
    }

    public Node getSource() {
        return source;
    }
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id='" + id + '\'' +
                ", source=" + source +
                ", destination=" + destination +
                ", cost=" + cost +
                '}';
    }
}