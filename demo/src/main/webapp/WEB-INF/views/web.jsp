<%@ page contentType="text/html; charset=UTF-8"%>

<!--<!DOCTYPE html>-->
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/web.css" />
  <title>Color-Insight</title>
</head>
<body>
<div class="body">
  <h3>오픈소스SW 1조의 팀프로젝트</h3>
  <h1
          style="
          text-shadow: -1px 0px black, 0px 1px black, 1px 0px black,
            0px -1px black;
        "
  >
    🎨 Find your Personal Color 🎨
  </h1>
  <form method="post" enctype="multipart/form-data">
  <div class="box">
    <div class="text">퍼스널컬러 진단을 위해 사진을 업로드하세요.</div>
    <input type="file" name="uploadFile" /> <!-- 파일 선택 -->
    <button type="submit">이미지 업로드</button>
  </div>
  </form>
</div>

<div class="bar">
  <a class="info" href="info"
  ><strong>전체 퍼스널컬러 정보 알아보기</strong></a
  >
  <a class="dev" href="develop"
  ><strong>개발 및 측정 방식 알아보기</strong></a
  >
</div>
</body>
</html>