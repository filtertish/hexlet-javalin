@import gg.jte.Content

@param Content show = null
@param Content index = null

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My site</title>
</head>
<body>
<header>
    <a href="/">main page</a>
    <a href="/courses">courses page</a>
</header>
<main>
    ${show}
    ${index}
</main>
<footer>
    <a href="https://github.com/filtertish/hexlet-javalin" style="font-style: italic">github</a>
</footer>
</body>
</html>