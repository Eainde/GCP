# Kubernates Engine

## some of the Kubernates engine commands
- gcloud config set project my-kubernetes-project-304910
- gcloud container clusters get-credentials my-cluster --zone europe-west2-b --project kubernates-project-430117
- kubectl create deployment order-service --image=kubernates-engine
- kubectl get deployment
- kubectl expose deployment order-service --type=LoadBalancer --port=8444
- kubectl get services
- kubectl get services --watch
- curl 104.154.241.192:8444/order/
- kubectl scale deployment hello-world-rest-api --replicas=3
- gcloud container clusters resize my-cluster --node-pool default-pool --num-nodes=2 --zone=us-central1-c
- kubectl autoscale deployment hello-world-rest-api --max=4 --cpu-percent=70
- kubectl get hpa
- kubectl create configmap hello-world-config --from-literal=RDS_DB_NAME=todos
- kubectl get configmap
- kubectl describe configmap hello-world-config
- kubectl create secret generic hello-world-secrets-1 --from-literal=RDS_PASSWORD=dummytodos
- kubectl get secret
- kubectl describe secret hello-world-secrets-1
- kubectl apply -f deployment.yaml
- gcloud container node-pools list --zone=us-central1-c --cluster=my-cluster
- kubectl get pods -o wide

- kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE
- kubectl get services
- kubectl get replicasets
- kubectl get pods
- kubectl delete pod hello-world-rest-api-58dc9d7fcc-8pv7r

- kubectl scale deployment hello-world-rest-api --replicas=1
- kubectl get replicasets
- gcloud projects list

- kubectl delete service hello-world-rest-api
- kubectl delete deployment hello-world-rest-api
- gcloud container clusters delete my-cluster --zone us-central1-c

## Commands to create docker image and push to google artifactory
- gcloud auth configure-docker
- export GOOGLE_APPLICATION_CREDENTIALS="/Users/akshaydipta/AD/GCP/kubernates-project-430117-6714c6310c5d.json"
_~~You can get this json file when you create the repository in google artifactory. There is option to generate a key. It will download the json for you._~~ 
- docker build --platform="linux/amd64" -t order-service .
_~~This docker build command is used to build a docker image to particular OS_~~
- kubectl describe node | grep "kubernetes.io/arch"
_~~Command to get the type of OS in kubernates~~_
- docker tag order-service gcr.io/kubernates-project-430117/order-service:v1
- docker push gcr.io/kubernates-project-430117/order-service:v1