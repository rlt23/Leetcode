//733. Flood Fill
//An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
//Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
//To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
//At the end, return the modified image.

//BFS APPROACH
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image.length == 0 || image == null || image[sr][sc] == newColor)return image;
        int m = image.length;
        int n = image[0].length;
        int originalColor = image[sr][sc];
        int[][] dirs = {{0,1},{0,-1}, {-1,0},{1,0}};
        Queue<int[]> q = new LinkedList<>();
        image[sr][sc] = newColor;
        q.add(new int[]{sr,sc});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int[] dir:dirs){
                int cr = curr[0] + dir[0];
                int cc = curr[1] + dir[1];
                if(cr>=0 && cc<n && cc>=0 && cr<m && image[cr][cc] ==originalColor ){
                    image[cr][cc] = newColor;
                    q.add(new int[]{cr,cc});
                }
            }
        }
        
    return image;
    }
}

//DFS
class Solution {
    int m;
    int n;
    int originalColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image.length == 0 || image == null || image[sr][sc] == newColor)return image;
        m = image.length;
        n = image[0].length;
        originalColor = image[sr][sc];
        dfs(image,sr,sc,newColor);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int newColor){
        //base
        if(sr<0 || sc<0 || sr==m || sc==n || image[sr][sc]!=originalColor)return;
        //logic
        image[sr][sc] = newColor;
        int[][] dirs = {{0,1},{0,-1}, {-1,0},{1,0}};
        for(int[] dir:dirs){
            int cr = dir[0] + sr;
            int cc = dir[1] + sc;
            dfs(image,cr,cc,newColor);
        }
    }
}