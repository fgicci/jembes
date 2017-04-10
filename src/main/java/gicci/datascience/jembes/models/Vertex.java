package gicci.datascience.jembes.models;

import java.util.HashMap;
import java.util.Map;

public class Vertex {

	private Integer id;
	private String name;
	private Map<Vertex, Double> adjacent;
	
	public Vertex() {}
	
	public Vertex(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.adjacent = new HashMap<Vertex, Double>();
	}
	
	public Vertex(Integer id, String name, Map<Vertex, Double> adjacent) {
		this.id = id;
		this.name = name;
		this.adjacent = adjacent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Vertex, Double> getAdjacent() {
		return adjacent;
	}

	public void setAdjacent(Map<Vertex, Double> adjacent) {
		this.adjacent = adjacent;
	}
	
	public Vertex addAdjacent(Vertex vertex, Double value) {
		this.getAdjacent().putIfAbsent(vertex, value);
		return vertex;
	}
	
	public Vertex updateAdjacent(Vertex vertex, Double value) {
		this.getAdjacent().replace(vertex, value);
		return vertex;
	}
	
	public Vertex removeAdjavent(Vertex vertex) {
		this.getAdjacent().remove(vertex);
		return vertex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vertex [id=" + id + "- " + name + "\nadjacent -> " + adjacent + "]";
	}
	
	
}
