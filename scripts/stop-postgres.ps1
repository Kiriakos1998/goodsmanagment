$containerName = "my_postgres"

Write-Host "Stopping PostgreSQL container..."

docker stop $containerName | Out-Null
docker rm $containerName | Out-Null

Write-Host "Container removed."