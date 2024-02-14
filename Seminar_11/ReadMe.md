скачиваем:
    nssm-2.24
    prometheus-2.49.1.windows-amd64
    grafana-enterprise-10.3.1.windows-amd64.msi

командная строка от имени администратора:
    переходим на диск где распакован nssm-2.24 
    (cd e:\Программы\IT\Spring\nssm-2.24\win64\)
    далее устанавливаем:
    nssm.exe install prometheus e:\Программы\IT\Spring\prometheus-2.49.1.windows-amd64\prometheus.exe


собираем из нескольких сервисов:
global:
scrape_interval: 15s
evaluation_interval: 15s

scrape_configs:
- job_name: 'microservice1'
  metrics_path: /metrics
  scheme: http
  static_configs:
- targets: ['microservice1:port']
- job_name: 'microservice2'
  metrics_path: /metrics
  scheme: http
  static_configs:
- targets: ['microservice2:port']
- job_name: 'microservice3'
  metrics_path: /metrics
  scheme: http
  static_configs:
- targets: ['microservice3:port']



https://github.com/GoogleCloudPlatform/microservices-demo
https://github.com/shev-81/WebMarket