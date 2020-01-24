public class tesException {

    public static void main(String[] args) {
        // TODO code application logic here
    Barang obj = new Barang();
           
    obj.setKode(null);
    obj.setNama("Penghapus");
     
    System.out.println("\nKode : " + obj.getKode());
    System.out.println("Nama   : " + obj.getNama());
   

    }
    
}
<?php 

require_once "../_config/config.php";
if (isset($_SESSION['user'])) {
  echo "<script>window.location='".base_url()."';</script>";
} else {

 ?>
 <!DOCTYPE html>
 <html>
 <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Aplikasi Tasyakur & Ziarah | Log in</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="<?php echo base_url('_assets/plugins/fontawesome-free/css/all.min.css')?>">
  <link rel="stylesheet" href="<?php echo base_url('_assets/plugins/icheck-bootstrap/icheck-bootstrap.min.css')?>">
  <link rel="stylesheet" href="<?php echo base_url('_assets/css/adminlte.min.css')?>">
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  <link href="<?php echo $gg;?>/_assets/bootstrap.min.css" rel="stylesheet">

</head>
<body class="hold-transition login-page">

  <div class="login-box">

    <div class="login-logo">
      <a href=""><i class="fa fa-desktop"></i> <b> Aplikasi</b><br> Tasyakur & Ziarah</a>
    </div>

    <div class="card">
      <div class="card-body login-card-body">
        <p class="login-box-msg"><small> Silahkan Login untuk memulai Aplikasi</small></p>

        <?php 
        if (isset($_POST['login'])) {
          $user = trim(mysqli_real_escape_string($koneksi, $_POST['uname']));
          $pass = md5(trim(mysqli_real_escape_string($koneksi, $_POST['upass'])));
          $sql_login = mysqli_query($koneksi, "SELECT * FROM tbl_user WHERE username = '$user' AND password = '$pass'") or die (mysqli_error($koneksi));
          if (mysqli_num_rows($sql_login) > 0) {
           $_SESSION['user'] = $user;
           echo "<script>window.location='".base_url()."';</script>";
         } 
         else { ?>
          <div class="row">
            <div class="col-lg-12 col-lg-offset-6">
              <div class="alert alert-warning alert-dismissable" role="alert">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                <strong>Login Gagal !</strong> Username atau Password salah 
              </div>
            </div>
          </div>
          
          <?php
        }
      }

      ?>

      <form method="post">

        <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Username" name="uname" required="required">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-user"></span>
            </div>
          </div>
        </div>

        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Password" name="upass" required="required">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col-8">
          </div>
          <div class="col-12">
            <button type="submit" name="login" class="btn btn-primary btn-block btn-flat">Masuk</button>
          </div>
        </div>

      </form>
      <hr>
      Copyright © 2019 - Akhmad Lylana.
    </div>

  </div>

</div>

<script src="<?php echo base_url('_assets/plugins/jquery/jquery.min.js')?>"></script>
<script src="<?php echo base_url('_assets/plugins/bootstrap/js/bootstrap.bundle.min.js')?>"></script>
<script src="<?php echo base_url('_assets/js/adminlte.min.js')?>"></script>

</body>
</html>
<?php } ?>
