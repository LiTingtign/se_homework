<%@ page language="java" pageEncoding="UTF-8" import="java.io.*"%>
 <!DOCTYPE HTML>
 <html>
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>文件上传及剪切板</title>
    <link rel="stylesheet" href="css/styl.css">
 </head>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/clipboard.js/1.7.1/clipboard.min.js"></script>
 <%

 File file=new File("E:/log1.txt");
 String p=null;
try {
//2构建文件输入流对象
       InputStream fileInoutStream=new FileInputStream(file);
//3、构建读取的容器
byte[] bytes=new byte[1024];
       StringBuilder stringBuilder=new StringBuilder();
int len=-1;//表示每次读取的字节长度
//read 传入数组 把数据读入到数组中，并返回读取的字节数，当不等于-1时，表示读取到数据，等于-1，表示读完了
while ((len=fileInoutStream.read(bytes))!=-1){
//stringBuilder.append(new String(bytes));
            stringBuilder.append(new String(bytes,0,len));
        }
        System.out.println(stringBuilder.toString());
   if(stringBuilder.toString()!=null){
	   p=stringBuilder.toString();
   }else{
	   p="请输入要复制内容";
   }
        fileInoutStream.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
 %>
 <body>
 <form action="UploadHandleServlet" enctype="multipart/form-data" method="post">
  上传用户：<input type="text" name="username"><br/>
  上传文件1：<input type="file" name="file1"><br/>
  上传文件2：<input type="file" name="file2"><br/>
  <input type="submit" value="提交">
 </form>
 <form action="ClipServlet" method="post">
 <input type="text" name="deliver" id="deliver"><br/>
 <input type="submit" value="提交复制内容">
 </form>
    <p>剪切板</p>
    <input type="text" id="copy-text" value=<%=p%>><br>

    <button id="click-copy">点我复制</button>
    <button id="click-paste">粘贴</button><br>
    <p class="paste-space"></p>
    <p class="paste-space"></p>
    <p class="paste-space"></p>
</body>
<script src="js/clip.js"></script>
</html>
