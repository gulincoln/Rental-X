#!/bin/bash

user="glrocha"
pass="Gu%402211x"
git config --unset-all https.proxy
git config --unset-all http.proxy

<<<<<<< HEAD
git config --global --add https.proxy https://$user:$pass@lnx237in.sjk.emb:9090
git config --global --add http.proxy http://$user:$pass@lnx237in.sjk.emb:9090
=======
git config --add https.proxy https://$user:$pass@lnx237in.sjk.emb:9090
git config --add http.proxy http://$user:$pass@lnx237in.sjk.emb:9090
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
