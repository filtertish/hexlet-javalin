<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add user</title>
</head>
<body>
<header>
    <a href="/users">users</a>
</header>
<form action="/users" method="post">
    <label>
        Username:
        <input type="text" name="username" required>
    </label>
    <label>
        Email:
        <input type="text" name="email" required>
    </label>
    <label>
        Password:
        <input type="text" name="password" required>
    </label>
    <label>
        Password again:
        <input type="text" name="password-again" required>
    </label>
    <button>Add user</button>
</form>
</body>
</html>