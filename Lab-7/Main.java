class Main {
  public static void main(String[] args) {
    String[] vertices = {"Liberal Arts",
    "Student Services", 
    " Health Careers & Sciences" 
  , "Health Technologies Center", 
   "Recreation Center",
    "Technology Learning Center", 
  "Business & Technology", 
  "Theatre"}; 

    int[][] edges = {
      {0,7}, {0, 1},
      {1, 0}, {1, 5}, {1, 6}, {1, 2}, {1, 4},
      {2, 1}, {2, 3}, {2, 4},
      {3, 2},
      {4, 2}, {4, 1},
      {5, 1}, {5, 6}, {5, 2}, {5, 4},
      {6, 7}, {6, 5},
      {7, 0}, {7, 6}
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
   
    graph.printPath(6); 

    
    graph.printTree(); 
  }
}