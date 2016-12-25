package com.saptarshidebnath.coursea.algo.unionfind;

/** Union Find. */
public class App {
  public static void main(final String[] args) {
    System.out.println("Union Find");
    final UnionFind uf = new UnionFind(10);
    uf.union(1, 2).union(3, 4).union(5, 6).union(1, 6);
    System.out.println("Is 2,6 : " + uf.isConnected(2, 6));
    System.out.println("Is 1,6 : " + uf.isConnected(1, 6));
    System.out.println("Is 1,4 : " + uf.isConnected(1, 4));
    uf.union(3, 7).union(7, 0).union(7, 8);
    System.out.println("Is 3,8 : " + uf.isConnected(3, 8));
    System.out.println("Is 3,0 : " + uf.isConnected(3, 0));
    System.out.println("Is 1,0 : " + uf.isConnected(1, 0));
    uf.union(0, 6);
    System.out.println("Is 1,0 : " + uf.isConnected(1, 0));
  }
}
