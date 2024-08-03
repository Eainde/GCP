# App Engine

## Command to deploy
gcloud app deploy --project=hack-team-clm-tech-geeks /Users/akshaydipta/AD/GIT/clm-tech-geeks/dementia/app.yaml /Users/akshaydipta/AD/GIT/clm-tech-geeks/dementia-ui/app.yaml
--service-account=workload@hack-team-clm-tech-geeks.iam.gserviceaccount.com

## some of the app engine commands
- gcloud app deploy
- gcloud app services list
- gcloud app versions list
- gcloud app instances list
- gcloud app deploy --version=v2
- gcloud app versions list
- gcloud app browse
- gcloud app browse --version 20210215t072907
- gcloud app deploy --version=v3 --no-promote
- gcloud app browse --version v3
- gcloud app services set-traffic split=v3=.5,v2=.5
- gcloud app services set-traffic splits=v3=.5,v2=.5
- watch curl https://melodic-furnace-304906.uc.r.appspot.com/
- gcloud app services set-traffic --splits=v3=.5,v2=.5 --split-by=random

- gcloud app deploy
- gcloud app browse --service=my-first-service

- gcloud app services list
- gcloud app regions list