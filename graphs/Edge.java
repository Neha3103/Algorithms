public class Edge {

    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer inputweight) {
        this.start = startV;
        this.end = endV;
        this.weight = inputweight;
    }

    public Vertex getstart() { // helper method
        return this.start;
    }

    public Vertex getend() { // helper method
        return this.end;
    }

    public Integer getweight() { // helper method
        return this.weight;
    }
}