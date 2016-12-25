package com.saptarshidebnath.coursea.algo.unionfind;

public class UnionFind {
  int length;
  int data[];

  public UnionFind(final int length) {
    this.length = length;
    this.data = new int[length];
    for (int i = 0; i < length; i++) {
      this.data[i] = i;
    }
  }

  public boolean isConnected(final int p, final int q) {
    final boolean response = (this.data[p] == this.data[q]);
    return response;
  }

  public UnionFind union(final int p, final int q) {
    if (!isConnected(p, q)) {
      final int rootP = this.data[p];
      final int rootQ = this.data[q];
      for (int i = 0; i < this.length; i++) {
        if (this.data[i] == rootP) {
          this.data[i] = rootQ;
        }
      }
    }
    return this;
  }
}
