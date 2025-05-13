package Easy;

public class FloodFill733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int r = image.length;
        int c = image[0].length;
        boolean[][] visited = new boolean[image.length][image[0].length];

        if(image[sr][sc]!=color) {
            DFS(sr, sc, color,image, visited,image[sr][sc]);
        }


        return image;
    }

    private void DFS(int sr, int sc, int color,int[][] image, boolean[][] visited,int initialColor) {

           if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||visited[sr][sc]){
               return;
           }
           if(image[sr][sc]==initialColor) {

               image[sr][sc] = color;
               visited[sr][sc] = true;

               DFS(sr + 1, sc, color, image, visited,initialColor);
               DFS(sr, sc + 1, color, image, visited,initialColor);
               DFS(sr - 1, sc, color,image, visited,initialColor);
               DFS(sr, sc - 1, color, image, visited,initialColor);
           }


    }

    public static void main(String[] args)
    {
       int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
       int sr = 1, sc = 1,  color = 2;
       FloodFill733 floodFill = new FloodFill733();
       floodFill.floodFill(image,sr,sc,color);
    }
}
