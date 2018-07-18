# Same-Characters-in-ZigZag-Matrix
<p>Accept a matrix of size <strong>NxN</strong> containing only characters as input. The program must print the characters which are in the same positions in the forward and the reverse zig-zag traversal. If there is no character in the same position in such traversal then print <strong>-1</strong> as the output.&nbsp;</p>

<p><strong>Boundary Condition(s):</strong><br>
2 &lt;= N &lt;= 20</p>

<p><strong>Input Format:</strong><br>
The first line contains the value of <strong>N</strong>.<br>
The next N lines contain <strong>N</strong>&nbsp;characters separated by space.</p>

<p><strong>Output Format:</strong><br>
The first line contains the characters which are in the same positions in the forward and the reverse zig-zag traversal separated by space(s) or -1. &nbsp;</p>

<p><strong>Example Input/ Output 1:</strong><br>
Input:<br>
5<br>
a b c d e<br>
f g h i j<br>
k l m n o<br>
f g h i j<br>
k r c f a</p>

<p>Output:<br>
a c h m</p>

<p><strong>Explanation:</strong><br>
In the forward traversal, the matrix contains <span style="font-size:16px"><span style="color:#0000cd"><strong>a</strong></span></span>, b, <span style="font-size:16px"><span style="color:#0000cd"><strong>c</strong></span></span>, d, e, j, i, <span style="color:#0000ff"><span style="font-size:16px"><strong>h</strong></span></span>, g, f, k, l, <span style="color:#0000cd"><span style="font-size:16px"><strong>m</strong></span></span>, n, o, j, i, h, g, f, k, r, c, f and a.<br>
In the reverse traversal, the matrix contains <span style="font-size:16px"><span style="color:#0000cd"><strong>a</strong></span></span>, f,&nbsp; <span style="font-size:16px"><span style="color:#0000ff"><strong>c</strong></span></span>, r,&nbsp; k, f, g, <span style="color:#0000cd"><span style="font-size:16px"><strong>h</strong></span></span>, i, j, o, n, <span style="color:#0000cd"><span style="font-size:16px"><strong>m</strong></span></span>, l, k, f, g, h, i, j, e, d, c, b and a.<br>
While traversing in the forward and reverse direction, the characters in the same positions are <span style="font-size:16px"><strong>a, c, h </strong>and <strong>m</strong></span> as highlighted in blue color.</p>

<p><strong>Example Input/ Output 2:</strong><br>
Input:<br>
6<br>
m o h n g i<br>
t s v u h r<br>
g l m n n o<br>
o c b d f g<br>
r h v v s t<br>
o g i g f e&nbsp;</p>

<p>Output:<br>
g r h v s t g o&nbsp;</p>

<p><strong>Example Input/ Output 3:</strong><br>
Input:<br>
4<br>
a b c d<br>
f g h i<br>
k l m n<br>
f g h i&nbsp;</p>

<p>Output:<br>
-1</p>
