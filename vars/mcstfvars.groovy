def setTerraformVariables() {
    
    env.TF_VAR_aws_region = env.aws_region
    env.TF_VAR_azs_private_subnet = env.azs_private_subnet
    env.TF_VAR_environment = env.environment
    env.TF_VAR_app_vpc_cidr_block = env.app_vpc_cidr_block
    env.TF_VAR_create_subnets = env.create_subnets
    env.TF_VAR_lt_image_id = env.lt_image_id
    env.TF_VAR_instance_type = env.instance_type
    env.TF_VAR_root_volume_size = env.root_volume_size
    env.TF_VAR_create_waf = env.create_waf
    env.TF_VAR_create_rds = env.create_rds
    env.TF_VAR_db_name = env.db_name
    env.TF_VAR_rds_port = env.rds_port
    env.TF_VAR_oracle_rds_engine = env.oracle_rds_engine
    env.TF_VAR_rds_allocated_storage = env.rds_allocated_storage
    env.TF_VAR_rds_instance_class = env.rds_instance_class
    env.TF_VAR_oracle_rds_engine_version = env.oracle_rds_engine_version
    env.TF_VAR_deletion_protection = env.deletion_protection
    env.TF_VAR_requestor = env.requestor
    env.TF_VAR_customer = env.customer
    env.TF_VAR_tenant = env.tenant
    env.TF_VAR_product = env.product
    env.TF_VAR_manager = env.manager
    env.TF_VAR_owner = env.owner
    env.TF_VAR_Request_id = env.Request_id
                 sh '''
                        export TF_VAR_aws_region="${aws_region}"
                        export TF_VAR_azs_private_subnet="${azs_private_subnet}"
                        export TF_VAR_environment="${environment}"
                        #"export TF_VAR_app_vpc_id='${env.TF_VAR_app_vpc_id}'"
                        export TF_VAR_app_vpc_cidr_block="${app_vpc_cidr_block}"
                        export TF_VAR_create_subnets="${create_subnets}"
                        #export TF_VAR_existing_subnet_ids='${env.TF_VAR_existing_subnet_ids}'
                        export TF_VAR_lt_image_id="${lt_image_id}"
                        export TF_VAR_instance_type="${instance_type}"
                        export TF_VAR_root_volume_size="${root_volume_size}"
                        export TF_VAR_create_waf="${create_waf}"
                        export TF_VAR_create_rds="${create_rds}"
                        export TF_VAR_db_name="${db_name}"
                        export TF_VAR_rds_port="${rds_port}"
                        export TF_VAR_oracle_rds_engine="${oracle_rds_engine}"
                        export TF_VAR_rds_allocated_storage="${rds_allocated_storage}"
                        export TF_VAR_rds_instance_class="${rds_instance_class}"
                        export TF_VAR_oracle_rds_engine_version="${oracle_rds_engine_version}"
                        export TF_VAR_deletion_protection="${deletion_protection}"
                        export TF_VAR_requestor="${requestor}"
                        export TF_VAR_customer="${customer}"
                        export TF_VAR_tenant="${tenant}"
                        export TF_VAR_product="${product}"
                        export TF_VAR_manager="${manager}"
                        export TF_VAR_owner="${owner}"
                        export TF_VAR_Request_id="${Request_id}"
                   '''
}
