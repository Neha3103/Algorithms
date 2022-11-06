import java.util.*;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputdata) {
        this.data = inputdata;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endvertex, Integer weight) {
        this.edges.add(new Edge(this, endvertex, weight));
    }

    public void removeedge(Vertex endvertex) {
        this.edges.removeIf(edge -> edge.getend().equals(endvertex));
    }

    public String getdata() {
        return this.data;
    }

    public ArrayList<Edge> getedges() {
        return this.edges;
    }

    public void print(boolean showweight) {
        String message = "";
        if (this.edges.size() == 0) {
            System.out.println(this.data + "-->");
            return;
        }
        for (int i = 0; i < this.edges.size(); i++) {
            if (i == 0) {
                message += this.edges.get(i).getstart().data + "--> ";
            }
            message += this.edges.get(i).getend().data;

            if (showweight) {
                message += " (" + this.edges.get(i).getweight() + ")";
            }

            if (i != this.edges.size() - 1) {
                message += ", ";
            }
            System.out.println(message);
        }

    }
}