#!/bin/bash
# NOTE: ./mysql-populate.sh <username> <password>
mysql_script_file="studentdb.sql"
mysql_username="$1"
mysql_password="$2"

#mysql_database="studentdb"
#mysql -u ${mysql_username} -p${mysql_password} ${mysql_database} < ${mysql_script_file}
mysql -u ${mysql_username} -p${mysql_password} < ${mysql_script_file}
