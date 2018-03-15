package challenge.widesolutions.ds.graph;

import java.util.List;

public class Graph {
    private final List<Node> nodes;
    private final List<Link> links;

    public Graph(List<Node> nodes, List<Link> links) {
        this.nodes = nodes;
        this.links = links;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Link> getLinks() {
        return links;
    }



}