package com.data.map;

import com.data.stack.MyStack;

/*
 * 图
 */
public class Graph {
	//顶点数组
	private Vertex[] vertexList;
	//邻接矩阵
	private int[][] adjMat;
	//顶点最大数目
	private int maxSize=20;
	//当前顶点
	private int nVertex;
	
	private MyStack stack;
	public Graph(){
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i=0;i<maxSize;i++){
			for(int j=0;j<maxSize;j++){
				adjMat[i][j] = 0;
			}
		}
		stack = new MyStack();
	}
	
	public void addVertex(char label){
		vertexList[nVertex++] = new Vertex(label);
	}
	
	public void addEdge(int start,int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public int getadjUnvisitedVertex(int v){
		for(int i=0;i<nVertex;i++){
			if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
				return i;
			}
		}

		return -1;
	}
	
	public void dfs(){
		//首先访问0号顶点
		vertexList[0].wasVisited = true;
		//显示该顶点
		displayVertex(0);
		//压入栈中
		stack.push(0);
		
		while(!stack.isEmpty()){
			//获得一个未访问过的邻接点
			int v = getadjUnvisitedVertex((int)stack.peak());
			if(v == -1){
				stack.pop();
			}else{
				vertexList[v].wasVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}
	}
	
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	} 
	
	//最小生成树
	public void mst(){
		//首先访问0号顶点
		vertexList[0].wasVisited = true;
		//压入栈中
		stack.push(0);
		
		while(!stack.isEmpty()){
			//当前顶点
			int currentVertex = (int)stack.peak(); 
			//获得一个未访问过的邻接点
			int v = getadjUnvisitedVertex(currentVertex);
			if(v == -1){
				stack.pop();
			}else{
				vertexList[v].wasVisited = true;
				stack.push(v);
				displayVertex(currentVertex);
				System.out.print("-");
				displayVertex(v);
				System.out.print(" ");
			}
		}
	}
}
