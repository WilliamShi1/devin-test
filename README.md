# Spring MVC AWS Demo

This is a Spring MVC application that integrates with AWS S3 and RDS, featuring a simple web interface for product management and file uploads.

## Configuration

The application uses environment variables for configuration. You need to set the following environment variables:

### AWS S3 Configuration
- `AWS_REGION`: AWS region (e.g., us-west-2)
- `AWS_ACCESS_KEY_ID`: Your AWS Access Key ID
- `AWS_SECRET_KEY`: Your AWS Secret Access Key
- `AWS_S3_BUCKET`: Your S3 bucket name

### AWS RDS Configuration
- `AWS_RDS_URL`: Complete JDBC URL for your RDS instance
- `AWS_RDS_USERNAME`: RDS database username
- `AWS_RDS_PASSWORD`: RDS database password

### AWS EC2 Configuration
- `AWS_EC2_HOST`: Your EC2 instance IP or hostname
- `AWS_EC2_USERNAME`: SSH username for EC2 instance (default: ec2-user)
- `AWS_EC2_KEY`: SSH private key for EC2 instance

## Deployment

The application is automatically deployed to AWS EC2 using GitHub Actions when changes are pushed to the main branch. The deployment workflow:

1. Builds the application
2. Runs tests
3. Packages the application
4. Deploys to the specified EC2 instance

### GitHub Secrets

The following secrets need to be configured in your GitHub repository:

- `AWS_ACCESS_KEY_ID`
- `AWS_SECRET_KEY`
- `AWS_REGION`
- `AWS_EC2_HOST`
- `AWS_EC2_USERNAME`
- `AWS_EC2_KEY`

## Local Development

To run the application locally:

```bash
./mvnw spring-boot:run
```

The application will be available at http://localhost:8080
# devintest
