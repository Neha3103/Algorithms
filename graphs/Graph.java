import java.util.*;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isweighted;
    private boolean isdirected;

    public Graph(boolean inputisweighted, boolean inputisdirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isweighted = inputisweighted;
        this.isdirected = inputisdirected;
    }

    public Vertex addvertex(String data) {
        Vertex newvertex = new Vertex(data);
        this.vertices.add(newvertex);
        return newvertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isweighted) {
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);
        if (!this.isdirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public void removeedge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeedge(vertex2);
        if (!this.isdirected) {
            vertex2.removeedge(vertex1);
        }
    }

    public void removevertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getvertices() {
        return this.vertices;
    }

    public boolean isweightedd() {
        return this.isweighted;
    }

    public boolean isweighted() {
        return this.isdirected;
    }

    public Vertex getvertexbyvalue(String value) {
        for (Vertex v : this.vertices) {
            if (v.getdata() == value) {
                return v;
            }
        }
        return null;
    }

    public void print() {
        for (Vertex v : this.vertices) {
            v.print(isweighted);
        }
    }

    public static void main(String[] args) {
        Graph busnetwork = new Graph(true, false);
        Vertex cliftonStation = busnetwork.addvertex("clifton ");
        Vertex CapeMay = busnetwork.addvertex("CapeMay");
        busnetwork.addEdge(cliftonStation, CapeMay, 1000);
        busnetwork.print();
    }
}