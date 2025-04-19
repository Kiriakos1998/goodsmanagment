# Start PostgreSQL container
$containerName = "my_postgres"
$postgresPassword = "mysecretpassword"
$hostPort = 5432
$containerPort = 5432
$volumeName = "pgdata"

docker run `
  --name $containerName `
  -e POSTGRES_PASSWORD=$postgresPassword `
  -p ${hostPort}:${containerPort} `
  -v "${volumeName}:/var/lib/postgresql/data" `
  -d postgres:16

Write-Host "PostgreSQL is running on port $hostPort with container name '$containerName'"