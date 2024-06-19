@import org.example.hexlet.repository.UsersRepository

@param UsersRepository usersRepository

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users list</title>
</head>
<body>
<header>
    <a href="/">main</a>
    <a href="/users/build">add user</a>
</header>
@if(usersRepository.getUsers().isEmpty())
    <p>No users found</p>
@else
    @for(var user : usersRepository.getUsers())
        <div style="border: 1px solid black">
            <p>${user.name()}</p>
            <p>${user.email()}</p>
        </div>
    @endfor
@endif
</body>
</html>